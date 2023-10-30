package com.chuwa.redbook.controller;

import com.chuwa.redbook.payload.AuthorDTO;
import com.chuwa.redbook.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public ResponseEntity<AuthorDTO> createAuthor(@RequestBody AuthorDTO authorDTO){
        AuthorDTO response = authorService.createAuthor(authorDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<AuthorDTO>> getAllAuthors(){
        return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public AuthorDTO getAuthorById(@PathVariable(name="id") long id){
        return authorService.getAuthorById(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<AuthorDTO> updateAuthorById(@PathVariable(name="id") long id, @RequestBody AuthorDTO authorDTO){
        AuthorDTO response = authorService.updateAuthor(authorDTO,id);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAuthorById(@PathVariable(name="id") long id){
        authorService.deleteAuthorById(id);
        return new ResponseEntity<>("Deleted.", HttpStatus.OK);
    }
}