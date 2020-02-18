#!/usr/bin/env python
import sys

def print_hello_world(name):
    output = "Hello {}!!".format(name)
    return output

if __name__ == "__main__":
    if (len(sys.argv) < 2):
        print("Please provide at least 1 parameter: \n usage: $ ./hello_world.py <name>")
        raise Exception("No name has been provided.")

    print(print_hello_world(sys.argv[1]))