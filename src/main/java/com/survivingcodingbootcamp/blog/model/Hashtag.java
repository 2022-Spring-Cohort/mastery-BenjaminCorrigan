package com.survivingcodingbootcamp.blog.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;


@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String hashtag;


    @ManyToMany
    private Collection<Post> posts;



    public Hashtag(){

    }

    public Hashtag(String hashtag, Post...posts) {
        this.hashtag = hashtag;
        this.posts = Arrays.asList(posts);

    }
    public Collection<Post> getPosts() {
        return posts;
    }
    public String getHashtag() {
        return hashtag;
    }

    public long getId() {
        return id;
    }
}
