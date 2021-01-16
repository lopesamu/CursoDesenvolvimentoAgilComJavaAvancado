<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

        <title>Hello, world!</title>
    </head>
    <body>
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <form method="POST" action="LoginServlet">
                    <br>
                    <p class="h4 fw-bold text-center">${erro}</p>
                    <div class="mb-3">
                        <label for="inputLogin" class="form-label">Login*</label>
                        <input type="text" class="form-control" id="inputLogin" required>
                    </div>
                    <div class="mb-3">
                        <label for="inputPassword" class="form-label">Password*</label>
                        <input type="password" class="form-control" id="inputPassword" required>
                    </div>
                    <div class="mb-3">
                        <label for="inputName" class="form-label">Nome*</label>
                        <input type="text" class="form-control" id="inputName" required>
                    </div>
                    <div class="mb-3">
                        <label for="inputLogin" class="form-label">Email*</label>
                        <input type="email" class="form-control" id="inputLogin" required>
                    </div>
                    <div class="d-grid gap-2">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
            </div>
            <div class="col-2"></div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    </body>
</html>
</html>
