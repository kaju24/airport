package com.example.airport.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import nl.randstadgroep.roneadapter.webapi.model.model.Notificatie;

public class EventHelper {
    public static String getTarrifUpdateEventJsonString(){
        return "{\n" +
                "  \"id\" : \"655502288\",\n" +
                "  \"entiteit\" : \"TRF\",\n" +
                "  \"dossier\" : \"PSG\",\n" +
                "  \"actie\" : \"UPD\",\n" +
                "  \"plaatsing\" : {\n" +
                "    \"plaatsingNummer\" : {\n" +
                "      \"psgId\" : \"10812791\",\n" +
                "      \"_value\" : \"123456\"\n" +
                "    },\n" +
                "    \"unitNummer\" : {\n" +
                "      \"afkorting\" : \"RRL-U8519\",\n" +
                "      \"oedId\" : \"2934506\",\n" +
                "      \"_value\" : \"5548519\"\n" +
                "    },\n" +
                "    \"labelNummer\" : {\n" +
                "      \"afkorting\" : \"RRL\",\n" +
                "      \"oedId\" : \"2649918\",\n" +
                "      \"_value\" : \"4540054\"\n" +
                "    },\n" +
                "    \"groepwerkmaatschappijNummer\" : {\n" +
                "      \"afkorting\" : \"RNL\",\n" +
                "      \"oedId\" : \"8\",\n" +
                "      \"_value\" : \"2000127\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"employee\" : {\n" +
                "    \"employeeNummer\" : {\n" +
                "      \"epeId\" : \"9120602\",\n" +
                "      \"esaId\" : \"10967919\",\n" +
                "      \"_value\" : \"243434\"\n" +
                "    },\n" +
                "    \"unitNummer\" : {\n" +
                "      \"afkorting\" : \"RRL-U8519\",\n" +
                "      \"oedId\" : \"2934506\",\n" +
                "      \"value\" : \"5548519\"\n" +
                "    },\n" +
                "    \"labelNummer\" : {\n" +
                "      \"afkorting\" : \"RRL\",\n" +
                "      \"oedId\" : \"2649918\",\n" +
                "      \"_value\" : \"4540054\"\n" +
                "    },\n" +
                "    \"groepwerkmaatschappijNummer\" : {\n" +
                "      \"afkorting\" : \"RNL\",\n" +
                "      \"oedId\" : \"8\",\n" +
                "      \"_value\" : \"2000127\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"bedrijf\" : {\n" +
                "    \"bedrijfNummer\" : {\n" +
                "      \"bdfId\" : \"359827\",\n" +
                "      \"bllId\" : \"1799239\",\n" +
                "      \"_value\" : \"2518747\"\n" +
                "    },\n" +
                "    \"unitNummer\" : {\n" +
                "      \"afkorting\" : \"RRL-U8519\",\n" +
                "      \"oedId\" : \"2934506\",\n" +
                "      \"value\" : \"5548519\"\n" +
                "    },\n" +
                "    \"labelNummer\" : {\n" +
                "      \"afkorting\" : \"RRL\",\n" +
                "      \"oedId\" : \"2649918\",\n" +
                "      \"_value\" : \"4540054\"\n" +
                "    },\n" +
                "    \"groepwerkmaatschappijNummer\" : {\n" +
                "      \"afkorting\" : \"RNL\",\n" +
                "      \"oedId\" : \"8\",\n" +
                "      \"_value\" : \"2000127\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"aanvraag\" : {\n" +
                "    \"aanvraagNummer\" : {\n" +
                "      \"avrId\" : \"2565775\",\n" +
                "      \"_value\" : \"2528909\"\n" +
                "    },\n" +
                "    \"unitNummer\" : {\n" +
                "      \"afkorting\" : \"RRL-U8519\",\n" +
                "      \"oedId\" : \"2934506\",\n" +
                "      \"_value\" : \"5548519\"\n" +
                "    },\n" +
                "    \"labelNummer\" : {\n" +
                "      \"afkorting\" : \"RRL\",\n" +
                "      \"oedId\" : \"2649918\",\n" +
                "      \"_value\" : \"4540054\"\n" +
                "    },\n" +
                "    \"groepwerkmaatschappijNummer\" : {\n" +
                "      \"afkorting\" : \"RNL\",\n" +
                "      \"oedId\" : \"8\",\n" +
                "      \"_value\" : \"2000127\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"contactpersonen\" : {\n" +
                "    \"contactpersoonPlaatsing\" : [ {\n" +
                "      \"contactpersoon\" : {\n" +
                "        \"recht\" : \"PCN\",\n" +
                "        \"_value\" : \"406910\"\n" +
                "      }\n" +
                "    }, {\n" +
                "      \"contactpersoon\" : {\n" +
                "        \"recht\" : \"PCN\",\n" +
                "        \"_value\" : \"459388\"\n" +
                "      }\n" +
                "    } ]\n" +
                "  },\n" +
                "  \"externePlaatsingIdentificaties\" : {\n" +
                "    \"factuurReferentie\" : \"PVA0064753\"\n" +
                "  }\n" +
                "}\n";
    }

    public static Notificatie getNotification() throws JsonProcessingException {
        return JsonUtils.getObjectFromJsonString(getTarrifUpdateEventJsonString(),Notificatie.class);
    }
}
