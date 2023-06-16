**Steps**
docker-compose up
docker exec -it f707edbdb93b bash   Change container name
Create myjars folder
Copy jar from local to that location
docker cp /home/prasoon/Downloads/datamigration-platformv2/out/artifacts/datamigration_platformv2_jar/datamigration-platformv2.jar f707edbdb93b:/opt/bitnami/spark/myjars

Run this spark submit comand
spark-submit --master local[*]              --class com.its.project1.framework.jobs.controllers.Job1   datamigration-platformv2.jar


