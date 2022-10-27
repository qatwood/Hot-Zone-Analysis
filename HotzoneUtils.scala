package cse512

import scala.math.max
import scala.math.min

object HotzoneUtils {
  /* ST_Contains -  User defined function to check whether a given point lies within the given rectangle
    @params : queryRectangle:String, pointString:String
    @return : Boolean (true or false)
  */
  def ST_Contains(queryRectangle:String, pointString:String): Boolean = {
    val rectanglePoints = queryRectangle.split(",")
    val givenPoint = pointString.split(",")
    var rPoint0 = rectanglePoints(0).toDouble
    var rPoint1 = rectanglePoints(1).toDouble
    var rPoint2 = rectanglePoints(2).toDouble
    var rPoint3 = rectanglePoints(3).toDouble
    /*Finding minX,maxX,minY,maxY */
    var minX = min(rPoint0,rPoint2)
    var minY = min(rPoint1,rPoint3)
    var maxX = max(rPoint0,rPoint2)
    var maxY = max(rPoint1,rPoint3)
    var x = givenPoint(0).toDouble
    var y = givenPoint(1).toDouble
    
    if (x >= minX  && x <= maxX && y >= minY && y <= maxY)  {
      return true
    }
    else  {
      return false
    }
  }

  // YOU NEED TO CHANGE THIS PART

}
