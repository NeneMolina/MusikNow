package com.fabianpalacios.itunesapi.Service.model;

import java.util.List;

public class Root {
    //Lista para almacenar los resultados
    private List<Result> results;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}

