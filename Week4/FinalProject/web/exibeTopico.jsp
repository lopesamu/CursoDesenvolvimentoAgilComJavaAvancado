<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

        <title>Exibir tópico</title>
    </head>
    <body>
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <p class="fs-3 text-center fw-bold">Título do tópico</p>
                <p class="fs-4 text-center">Nome do criador</p>
                <p class="fs-6">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget diam lobortis, placerat nisi vitae, tristique risus. Sed nec semper tellus. Maecenas elementum elit eu consequat faucibus. Suspendisse ultricies nulla quis tellus commodo, ut laoreet purus mattis. In hac habitasse platea dictumst. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Etiam porta nunc a sem tristique, a porttitor erat imperdiet. Nunc sagittis leo et tellus pulvinar bibendum. Aenean urna justo, porttitor quis erat et, sollicitudin bibendum ex.</p>
            </div>
            <div class="col-2"></div>
        </div>
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <p class="h3 fw-bold text-start mt-3">Comentários</p>
                <div class="list-group">
                    <a href="#" class="list-group-item list-group-item-action" aria-current="true">
                        <div class="d-flex w-100 justify-content-between">
                            <h5 class="mb-1">Usuário</h5>
                        </div>
                        <p class="mb-1">Comentário</p>
                    </a>
                    <a href="#" class="list-group-item list-group-item-action" aria-current="true">
                        <div class="d-flex w-100 justify-content-between">
                            <h5 class="mb-1">Usuário</h5>
                        </div>
                        <p class="mb-1">Comentário</p>
                    </a>
                    <a href="#" class="list-group-item list-group-item-action" aria-current="true">
                        <div class="d-flex w-100 justify-content-between">
                            <h5 class="mb-1">Usuário</h5>
                        </div>
                        <p class="mb-1">Comentário</p>
                    </a>
                </div> 
                <form method="POST" action="ComentarioServlet">
                    <div class="form-group mt-3">
                        <label for="exampleFormControlTextarea1">Adicionar Comentário</label>
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="inputComment"></textarea>
                        <div class="d-grid gap-2">
                            <button type="submit" class="btn btn-primary">Comentar</button>
                            <a type="button" class="btn btn-outline-primary" href="topicos.jsp">Visualizar Tópicos</a>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-2"></div>

        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    </body>
</html>

