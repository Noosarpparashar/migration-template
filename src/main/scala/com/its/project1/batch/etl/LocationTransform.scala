package com.its.project1.batch.etl
import org.apache.spark.sql.SparkSession

class LocationTransform(spark: SparkSession) {

  import spark.implicits._
  val columns = Seq("language","users_count")
  val data = Seq(("Java", "20000"), ("Python", "100000"), ("Scala", "3000"))

  val rdd = spark.sparkContext.parallelize(data)


  val dfFromRDD1 = rdd.toDF("language1","users_count1")
  println(dfFromRDD1.printSchema())

}
