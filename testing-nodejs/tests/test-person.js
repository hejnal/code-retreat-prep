var Person = require("../some-basic-class.js").Person;

var expect = require("chai").expect;
var assert = require("chai").assert;

describe("Very basic test for Person", function() {
    it("should return right hello message", function() {
        var person = new Person();
        person.name = "james";

        assert.equal("Hello James!", person.sayHello());
    });

    it("should be an instance of Person class", function() {
        var person = new Person();
        
        expect(person).to.be.instanceOf(Person);
    });
});