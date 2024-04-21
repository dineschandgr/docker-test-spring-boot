Steps 1:

#Generate JAR file
Run mvn clean package

Step 2:

#Build Docker Image 
 docker build -t docker-test-spring-boot-image .

Step 3

#Create Docker Container from Image
docker run --name docker-test-spring-boot-container -d -p 8090:8090 docker-test-spring-boot-image

Step 4

#Access APIs using

http://localhost:8090/address/all


<img width="795" alt="Screenshot 2024-04-22 at 1 18 19 AM" src="https://github.com/dineschandgr/docker-test-spring-boot/assets/2795442/6327b753-10f5-42ac-9f4e-0432355cc7bd">



<img width="775" alt="Screenshot 2024-04-22 at 1 18 27 AM" src="https://github.com/dineschandgr/docker-test-spring-boot/assets/2795442/1ad3c94a-f949-4847-9515-a7aba008601a">


