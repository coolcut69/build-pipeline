package com.theapsgroup.services

import spock.lang.Specification

/**
 *
 */
class BookServiceTest extends Specification {

    def BookService bookService = new BookServiceImpl()

    def "all book should return empty list"() {

        expect:
        bookService.getAllBooks().size() == 0
    }
}
