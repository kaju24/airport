<#ftl output_format="HTML"/>

<!DOCTYPE html>
<html lang="en">
<#-- @ftlvariable name="runway" type="com.example.airport.data.model.RunwayEntity" -->
<head>
    <title>Airport</title>
    <link rel="stylesheet" href="resources/css/orbit-randstad.css">
    <link rel="stylesheet" href="resources/css/tailwind.css">
    <link rel="stylesheet" href="resources/css/variables.css">
    <link rel="stylesheet" href="resources/css/orbit-additions-switch.css">
    <link rel="stylesheet" href="resources/css/orbit-additions-general.css">
</head>

<body>

<header class="header header--text header--compact bg-variant-brand-tertiary">
    <div class="header__wrapper wrapper">
        <div class="header__content header__content--full-width content-block">
            <h1 class="content-block__title">
                Airport Assessment
            </h1>
        </div>
    </div>
</header>

<!-- Real life metrics / monitoring -->
<div class="bg-variant-brand-tertiary" style="padding-bottom: 50px">
    <body>
    <div>
        <form method="get" action="/test">
            <div>

                <label>Country Code</label>

                <div>
                    <input id="code" name="code"/>
                </div>

                <label>Country Name</label>

                <div>
                    <input id="name" name="name"/>
                </div>

                <div>
                    <input type="submit" value="Submit"/>
                </div>

            </div>
        </form>
    </div>
    <div>
        <#if runways??>
            <#list runways as runway>
                <div>${runway.id?string!''}</div>
            </#list>
        </#if>
    </div>

    </body>
</div>

</body>
</html>