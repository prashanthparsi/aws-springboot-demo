# aws-springboot-demo
Demo using EBS, EC2, RDS and various internal aws services (configured under my account)


To make this app up and running, 
1) Login into AWS console and configure the Elastic BeanStalk service (Detail instructions can be found here: https://aws.amazon.com/blogs/devops/deploying-a-spring-boot-application-on-aws-using-aws-elastic-beanstalk/)
2) Configuring EBS will create the RDS and EC2 instance.

Some of the APIs calls exposed from the sample app:
http://aws-springboot-demo.us-east-2.elasticbeanstalk.com/user/all
http://aws-springboot-demo.us-east-2.elasticbeanstalk.com/user/add?name=firstname&email=someemail@someemailprovider.com
http://aws-springboot-demo.us-east-2.elasticbeanstalk.com/user/hello

The app talks to mysql (created using RDS) and creates the "user" table and inserts the data into the table.

We can connect to mySQL using mySQL workbench using below instructions.

https://www.lucidchart.com/documents/view/703f6119-4838-4bbb-bc7e-be2fb75e89e5/6


SSH hostname is the EC2 instance public IP
username: ec2-user
no password
key file: created keypair.pem path
sql hostname is the endpoint of RDS host (can be found in RDS database instance configuration)
port 3306
enter credentials
Test connection and after success, connect and start querying
