#!/usr/bin/env python

def test_sum():
    assert sum([1, 2, 3, 4]) == 10, "Should be 10"

def test_tuple():
    assert sum((1, 2, 3)) == 6, "Should be 6"