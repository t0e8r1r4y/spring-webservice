#!/bin/bash

arg1=$1

echo ">git statuc check"
STATUS_RES=$(git status)

echo "> $STATUS_RES"

if [[ "$STATUS_RES" == *modified:* ]]; then
   echo "> start to push git remote repo"

   echo "> git add cmd"
   git add .

   echo "> git commit cmd"
   if [ -z $arg1 ]; then
	git commit -m "not found command"
   else
	git commit -m "$arg1"
   fi

   echo "> push"
   git push -u --force origin master   

else
   echo "> end script"
fi
