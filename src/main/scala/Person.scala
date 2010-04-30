/**
 * Copyright (c) 2010 WeigleWilczek.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

object Person {
  def apply(firstName: String = "", lastName: String = "") = new Person(firstName, lastName)
  implicit def stringToPerson(name: String) = {
    require(name != null)
    name split " " toSeq match {
      case Seq(firstName, lastName) => Person(firstName, lastName)
      case _ => Person(name)
    }
  }
}

class Person(var firstName: String = "", var lastName: String = "") {
  require(firstName != null, "firstName must not be null!")
  require(lastName != null, "lastName must not be null!")
  def name = "%s %s".format(firstName, lastName).trim
  override def toString = name
}
