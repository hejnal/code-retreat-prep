#!/usr/bin/env python

import unittest

class TestSum(unittest.TestCase):

    def testSum(self):
        self.assertEqual(sum([1, 2, 3]), 6, "should be 6")
    
    def testSumTuple(self):
        self.assertEqual(sum((1, 2, 3)), 6, "should be 6")