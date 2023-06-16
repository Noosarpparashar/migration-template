package com.its.project1.framework.jobs.controllers

import com.its.project1.batch.etl.LocationTransform
import org.apache.spark.sql.SparkSession

object Job1 {
  def main(args: Array[String]): Unit = {
    val spark:SparkSession = SparkSession.builder()
      .master("local[1]").appName("SparkByExamples3.com")
      .getOrCreate()
    val customerTransform = new LocationTransform(spark:SparkSession)
    println("Hello")
  }

}




