import unittest
from hello_world import print_hello_world

class HelloWorldTest(unittest.TestCase):
    def test_hell_world(self):
        output = print_hello_world("MY TEST")
        self.assertEqual(output, "Hello MY TEST!!", "should be Hello MY TEST!!")