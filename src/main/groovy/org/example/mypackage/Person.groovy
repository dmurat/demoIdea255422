package org.example.mypackage

import groovy.transform.CompileStatic
import groovy.transform.Immutable

@Immutable
@CompileStatic
class Person {
  String firstName
  String lastName

  static Person createWithMapConstructor() {
    return new Person(firstName: "firstName from map constructor", lastName: "lastName from map constructor")
  }

  static Person createWithTupleConstructor() {
    return new Person("firstName from tuple constructor", "lastName from tuple constructor")
  }

  static void main(String[] args) {
    println createWithMapConstructor()
    println createWithTupleConstructor()
  }
}
