<html>
<body>
	<h1>Rotten</h1>
    <p>This is a sample web app implementing both a url shortener and a pastebin. It's rotten.
    </p>
    <p><input id="url" type="text" name="url"><input id="shorten-button" type="submit" value="Shorten"></p>
    <div id="newurl"></div>
    <h2>API Design</h2>
    <p>GET /s/{id}</p>
    <p>retrieves a shorten URL, redirects to actual URL</p>
    <p>POST /s</p>
    <p>body: {'url': url}</p>
    <p>creates a shortened URL</p>

    <script src="resources/libs/jquery-2.1.1.js"></script>

    <script>
        $( document ).ready(function() {
            $("#shorten-button").click(function() {
                // They clicked the shorten button
                console.log("button clicked");

                console.log($("#url").val());

                var obj = { url: $("#url").val() };

                console.log(obj);

                $.post("/s", obj, function(data, status) {
                    console.log("response received");
                    console.log(data);

                    var newUrl = "http://localhost:8080/s/" + data.id;


                    $("#newurl").html("shorty url: ").append("<a href=\"" + newUrl + "\">" + newUrl + "</a>");
                });
            });
        });
    </script>
</body>
</html>