/**
 * Copyright (c) 2010 WeigleWilczek.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

abstract class Animal {
  def name: String
  override def toString = name
}

class DefaultAnimal(override val name: String) extends Animal

class Bird(name: String) extends DefaultAnimal(name) {
  def fly = "I can fly!"
}

trait CanSwim {
  def swim = "I can swim!"
}

class Fish(name: String) extends DefaultAnimal(name) with CanSwim

class Duck(name: String) extends Bird(name) with CanSwim

trait MichaelBuble extends Bird {
  override def fly = "I feel good! And " + super.fly
}

trait BrokenWings extends Bird {
  override def fly = "I hope that soon " + super.fly
}

case class Cage[A](animal: A)
