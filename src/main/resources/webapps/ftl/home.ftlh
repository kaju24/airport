<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">

    <title>Airport Assesment</title>


    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="resources/dist/css/bootstrap.min.css">
    <#--<link href="${dist/css/bootstrap.min.css}" rel="stylesheet">-->

    <!-- Custom styles for this template -->
    <#-- <link href="jumbotron.css" rel="stylesheet">-->
</head>

<body data-new-gr-c-s-check-loaded="14.1087.0" data-gr-ext-installed="">


<main>


    <div class="container bg-light my-2">
        <div class="bd-example-row">
            <h1 class="display-3">Airport Assessment!</h1>
            <p>This is the page to experience airport assessment resul in action</p>
        </div>
    </div>
    <hr>
    <div class="container">
        <!-- Example row of columns -->
        <div class="row">
            <div class="col-md-4 border-right">

                <h2>Search Runways</h2>
                <p>Runways for each airport given a country code or country name. </p>

                <#if error??>
                    <p class="text-danger">
                       ${error}
                    </p>
                </#if>

                <#if info??>
                    <p class="text-danger">
                        ${info}
                    </p>
                </#if>

                <form method="get" action="/airport">
                    <div class="form-row align-items-center">
                        <div class="col-auto">
                            <input type="text" class="form-control mb-2" id="name" name="name"
                                   placeholder="country name">
                        </div>
                        <div class="col-auto">
                            <input type="text" class="form-control mb-2" id="code" name="code"
                                   placeholder="country code">
                        </div>
                        <div class="col-auto">
                            <button type="submit" class="btn btn-primary mb-2">Submit</button>
                        </div>
                    </div>
                </form>


                <#if runways??>
                    <ul class="list-group">

                        <li class="list-group-item d-flex justify-content-between align-items-center">
                            <span class="font-weight-bold">Airport name</span> &nbsp; &nbsp; &nbsp; &nbsp;<span class="font-weight-bold">Runway id</span>
                         </li>
                        <#list runways as runway>
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                ${runway.airport.name!''}
                                <span class="badge badge-primary badge-pill">${runway.id?c!''}</span>
                            </li>
                        </#list>

                    </ul>
                </#if>

            </div>


            <div class="col-md-4 border-right">
                <h2>List Countries</h2>
                <p>Top 10 countries with the highest number of airports.</p>


                <form method="get" action="/countries">
                    <div class="col-auto">
                        <button type="submit" class="btn btn-primary mb-2">List</button>
                    </div>
                </form>


                <div>
                    <#if countries??>

                        <ul class="list-group">

                            <#list countries as country>

                                <li class="list-group-item d-flex justify-content-between align-items-center">
                                    ${country.name!''}
                                    <#-- <span class="badge badge-primary badge-pill">${runway.id?c!''}</span>-->
                                </li>
                            </#list>

                        </ul>

                    </#if>
                </div>

            </div>


            <div class="col-md-4">
                <h2>Fuzzy Search Countries</h2>
                <p>Retrieving the information given a partial/fuzzy country code/name as input parameter, e.g. entering
                    'zimb' will result in 'Zimbabwe'.</p>

                <form method="get" action="/search">
                    <div class="form-row align-items-center">
                        <div class="col-auto">
                           <#-- <input type="text" class="form-control mb-2" id="keyword" name="keyword"
                                   placeholder="partial country name or code">-->

                            <input class="form-control basicAutoComplete" type="text" id="keyword" name="keyword"
                                   autocomplete="off">
                        </div>
                        <div class="col-auto">
                            <button type="submit" class="btn btn-primary mb-2">Submit</button>
                        </div>
                    </div>
                </form>

                <div>
                    <#if countriesFuzzy??>

                        <ul class="list-group">

                            <#list countriesFuzzy as country>

                                <li class="list-group-item d-flex justify-content-between align-items-center">
                                    ${country.name!''}
                                    <#-- <span class="badge badge-primary badge-pill">${runway.id?c!''}</span>-->
                                </li>
                            </#list>

                        </ul>

                    </#if>
                </div>
            </div>


        </div>

        <hr>

    </div> <!-- /container -->

</main>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

<script src="resources/dist/js/jquery-3.2.1.min.js"></script>
<script src="resources/dist/js/bootstrap.js"></script>
<script src="resources/dist/js/bootstrap-autocomplete.min.js"></script>

<script>
    $('.basicAutoComplete').autoComplete({
        minLength: 2,
        resolverSettings: {
            url: 'searchAsync',
            queryKey: 'keyword'

        }
    });


</script>
</body>