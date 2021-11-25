package com.example.reproductormusica;

public class Musica {
    private String path;
    private String titulo;
    private String artista;
    private String album;
    private String duracion;

    public Musica(String path, String titulo, String artista, String album, String duracion) {
        this.path = path;
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
    }

    public Musica() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
