# spring-webservice
스프링부트로 AWS EC2에 간단한 웹 서비스 서버를 띄워보는 미니 프로젝트입니다.

진행의도와 아래 순서의 개발 과정은 [개인 블로그에 작성하였습니다.](https://medium.com/@tas.com/web-%EA%B0%9C%EB%B0%9C-%ED%95%9C-%EC%82%AC%EC%9D%B4%ED%81%B4-%EB%8F%8C%EC%95%84%EB%B3%B4%EA%B8%B0-4a9de83c7d40)

###### 1. 서버 어플리케이션 개발 (springboot에 대한 핵심 개념과 동작원리 분석 목적으로 별도 리포지토리에 프로젝트 생성하고 세부적으로 개발 내용 설명 추가 예정)


###### 2. [AWS EC2,RDS, CodeDeploy, S3 버킷 생성](https://medium.com/@tas.com/springboot-web%EC%9D%84-ec2%EC%97%90-%EB%B0%B0%ED%8F%AC-%EC%9A%B4%EC%98%81-%ED%99%98%EA%B2%BD-%EA%B5%AC%EC%84%B1-21121fbe8e9)


###### 3. [Travis CI와 nginx를 사용한 무중단 배포](https://medium.com/@tas.com/travis-ci%EB%A5%BC-%ED%86%B5%ED%95%9C-%EB%B0%B0%ED%8F%AC-c0c7d6c3da0f)


###### 4. [운영 DB 연동](https://medium.com/@tas.com/%EC%9B%B9-%EC%84%9C%EB%B9%84%EC%8A%A4%EC%97%90-%EC%9A%B4%EC%98%81-db-rds-mariadb-%EC%97%B0%EA%B2%B0%ED%95%98%EA%B8%B0-a9923404acc5)


###### 추가 개발 진행 중인 사항


- EC2에서 쉘스크립트로 운영 중인 애플리케이션의 actuator/health 체크를 통해서 비정상 동작에 대해 프로세스 재시작 로직 개발 중
