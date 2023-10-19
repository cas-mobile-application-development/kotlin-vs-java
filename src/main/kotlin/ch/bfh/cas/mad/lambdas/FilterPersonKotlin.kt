package ch.bfh.cas.mad.lambdas

import ch.bfh.cas.mad.data.PersonKotlin

class FilterPersonKotlin {
    fun filterMajor(persons: List<PersonKotlin>): List<PersonKotlin> {
        return persons.filter { person -> person.age >= 18 }
    }
}