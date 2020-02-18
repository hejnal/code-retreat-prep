var expect = require("chai").expect;
var init = require("../helloWorld.js").init;

describe("Main hello world test", function () {
    it('Hello world test', function () {
        expect(init()).to.equal("Hello World!");
    });
});