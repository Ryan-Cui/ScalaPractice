package cn.ryancui.class6

/**
  * Created by Ryan on 2017/4/30.
  */
case class DataBase() {
  def save {}
  def update {}
  def delete {}
}

abstract class BaseController(db: DataBase) {

  def save { db.save }
  def update { db.update }
  def delete { db.delete }

  // abstract
  def connect // no body makes the method abstract

  // an abstract method that returns a String
  def getStatus: String

  // an abstract method that takes a parameter
  def setServerName(serverName: String)
}
