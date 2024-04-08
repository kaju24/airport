package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ClientCorrelationResponseAllOf
 */

@JsonTypeName("ClientCorrelationResponse_allOf")

public class ClientCorrelationResponseAllOf {


    private List<ClientCorrelation> clients;

    public ClientCorrelationResponseAllOf clients(List<ClientCorrelation> clients) {
        this.clients = clients;
        return this;
    }

    public ClientCorrelationResponseAllOf addClientsItem(ClientCorrelation clientsItem) {
        if (this.clients == null) {
            this.clients = new ArrayList<>();
        }
        this.clients.add(clientsItem);
        return this;
    }

    /**
     * Get clients
     *
     * @return clients
     */


    @JsonProperty("clients")
    public List<ClientCorrelation> getClients() {
        return clients;
    }

    public void setClients(List<ClientCorrelation> clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClientCorrelationResponseAllOf clientCorrelationResponseAllOf = (ClientCorrelationResponseAllOf) o;
        return Objects.equals(this.clients, clientCorrelationResponseAllOf.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clients);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientCorrelationResponseAllOf {\n");
        sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

