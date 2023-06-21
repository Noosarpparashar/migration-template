# Project Name - migration-template
This project contains a generic template that can be used for data migration or any big data project. Please refer to [this](https://github.com/Noosarpparashar/migration-template/blob/main/Readme.md) Readme for detailed instructions.

 By adopting this structure, you can streamline your development process, improve scalability, and enhance maintainability. 
```shell
   src
└── main
    └── scala
        └── com
            └── organisationname
                ├── project1
                │   ├── batch
                │   │   ├── common
                │   │   │   ├── LoadData.scala
                │   │   │   ├── ProcessData.scala
                │   │   │   └── RetrieveData.scala
                │   │   ├── etl
                │   │   │   ├── CustomerTransform.scala
                │   │   │   ├── LocationTransform.scala
                │   │   │   ├── LoginsTransform.scala
                │   │   │   ├── ProductTransform.scala
                │   │   │   └── SalesTransform.scala
                │   │   └── validate
                │   │       ├── DataValidationException.scala
                │   │       └── DataValidator.scala
                │   ├── configs
                │   │   ├── dev
                │   │   │   ├── database.conf
                │   │   │   └── kafka.conf
                │   │   ├── preprod
                │   │   │   ├── database.conf
                │   │   │   └── kafka.conf
                │   │   └── prod
                │   │       ├── database.conf
                │   │       └── kafka.conf
                │   ├── framework
                │   │   ├── ddl
                │   │   │   └── db
                │   │   │       └── schema
                │   │   │           ├── Table1.sql
                │   │   │           └── Table2.sql
                │   │   ├── jobs
                │   │   │   ├── controllers
                │   │   │   │   └── Job1.scala
                │   │   │   ├── JobManager.scala
                │   │   │   └── JobsEnum.scala
                │   │   ├── migration
                │   │   │   └── DatabaseMigration.scala
                │   │   ├── model
                │   │   │   ├── DataLake.scala
                │   │   │   ├── Dimension.scala
                │   │   │   └── Fact.scala
                │   │   ├── scd
                │   │   │   ├── SCD1.scala
                │   │   │   ├── SCD1sql.scala
                │   │   │   ├── SCD2.scala
                │   │   │   └── SCD2sql.scala
                │   │   └── util
                │   │       ├── elasticsearch
                │   │       │   ├── ElasticsearchConnection.scala
                │   │       │   ├── ElasticSearchReader.scala
                │   │       │   └── ElasticSearchWriter.scala
                │   │       ├── postgres
                │   │       │   ├── PostgresConnection.scala
                │   │       │   ├── PostgresReader.scala
                │   │       │   └── PostgresWriter.scala
                │   │       └── s3
                │   │           ├── S3Connection.scala
                │   │           ├── S3Reader.scala
                │   │           └── S3Writer.scala
                │   └── streaming
                │       ├── kafka
                │       │   ├── consumer
                │       │   │   ├── common
                │       │   │   ├── Consumer1.scala
                │       │   │   └── Consumer2.scala
                │       │   ├── producer
                │       │   │   ├── common
                │       │   │   ├── Producer1.scala
                │       │   │   └── Producer2.scala
                │       │   └── serialization
                │       │       ├── Table1.avsc
                │       │       └── Table2.avsc
                │       └── kinesis
                └── project2
                    └── 

   ```
