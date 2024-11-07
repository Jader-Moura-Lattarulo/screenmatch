package main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.OmdbTitle;
import models.Title;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var search = scanner.nextLine().replace(' ', '+');

        String address = "http://www.omdbapi.com/?t=" + search + "&apikey=79863d6d";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        OmdbTitle myTitleOmdb = gson.fromJson(json, OmdbTitle.class);
        System.out.println(myTitleOmdb);
        Title myTitle = new Title(myTitleOmdb);
        System.out.println(myTitle);

    }
}
