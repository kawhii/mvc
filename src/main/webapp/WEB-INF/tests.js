//test-1
QUnit.test( "hello test", function( assert ) {
    assert.expect(2);

    assert.ok( 1 === 1, "Passed!" );
    assert.ok( 1 === "2", "1 === 2!" );

    var done = assert.async();
    setTimeout(function() {
        assert.ok( 2 == 2, "2===2!" );
        done();
    }, 3000);
});