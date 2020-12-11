
package com.example.myapplication


fun main() {
        val person4= Person(30, "Name2")
        val person2= Person(29, "Name2")
        val person3= Person(28, "Name3")
        val person1= Person(27, "Name4")
        val person5= Person(26, "Name5")
        val person6= Person(25, "Name6")
        val person7= Person(24, "Name7")
        val person8= Person(23, "Name8")
        val person9= Person(22, "Name9")
        val person10= Person(21, "Name10")


        val map = mutableMapOf<Person, Any?>()
        println("map.isEmpty() is ${map.isEmpty()}") // true

        map.put(person1,"Any1")
        map.put(person2,"Any2")
        map.put(person3,"Any3")
        map.put(person4,"Any4")
        map.put(person5,"Any5")
        map.put(person6,"Any6")
        map.put(person7,"Any7")
        map.put(person8,"Any8")
        map.put(person9,"Any9")
        map.put(person10,"Any10")



        println("________________ before sotring ___________________")
        println(map)
        println("________________ after sotring ___________________")
        val sortedmap= map.toSortedMap(compareBy <Person> {it.age} )
        println(sortedmap)

}



data class Person (val age:Int=0,val name:String="no_name") {
        override fun toString(): String {
                return  "//(( age is $age,  name is = $name ))// \n "
        }
}







































