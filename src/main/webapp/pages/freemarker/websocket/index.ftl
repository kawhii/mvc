<!DOCTYPE html>
<html>
<head>
    <base href="/"/>
    <meta content="text/html" charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>web-socket</title>
    <script src="!resource/lib/socketjs/sockjs.min.js"></script>
</head>
<body>
<h2>WEB SOCKET 测试</h2>
<script>
    var sock = new SockJS('http://localhost:8080/echo');
    sock.onopen = function() {
        console.log('open');
    };
    sock.onmessage = function(e) {
        console.log('message', e.data);
    };
    sock.onclose = function() {
        console.log('close');
    };

    sock.send('test');
    sock.close();
</script>
</body>
</html>