package com.theapsgroup.domain

import spock.lang.Specification

/**
 *
 */
class BookTest extends Specification {

    def "book should have 0 pages when created"() {
        Book book = new Book();

        expect:
        book.pages == 0
    }
}
