<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

        <title>Inserir novo tópico</title>
    </head>
    <body>
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <form method="POST" action="InsereTopicoServlet">
                    <br>
                    <p class="h4 fw-bold text-center">Inserir novo tópico</p>
                    <div class="mb-3">
                        <label for="inputTitulo" class="form-label">Título</label>
                        <input type="text" class="form-control" id="inputTitulo" name="inputTitulo" required>
                    </div>
                    <div class="mb-3">   
                        <label for="exampleFormControlTextarea1">Texto</label>
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="20" name="inputText"></textarea>
                        <div class="d-grid gap-2 mt-3">
                            <button type="submit" class="btn btn-primary">Publicar</button>
                            <a type="button" class="btn btn-outline-primary" href="topicos.jsp">Voltar</a>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-2"></div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    </body>
</html>