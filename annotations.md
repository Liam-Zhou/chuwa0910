# annotations - Grace Hu


## Config

**@Configuration**/**@Bean**: **@Configuration** indicates a class contains one or more bean definitions, and any methods within the class that are annotated with **@Bean** will be used to create and configure beans.


## Entity
**@Entity**: Marks a class as a JPA entity, indicating that it will be persisted to the database.

**@Table**: Specifies the details of the database table to be used for mapping.

**@UniqueConstraint**

**@Id**: Marks the field as a primary key in the database.

**@GeneratedValue**: Defines the strategy for generating primary keys.

**@JsonProperty**: Specifies the name of the property as it should appear in the JSON representation, overriding the default behavior of using the field name.

**@OneToMany**
**@ManyToOne**: Indicates a many-to-one relationship(current class-other class).
**@ManyToMany**

**@JoinColumn**: Specifies the foreign key column (other class) in the current class table.

**@Column**: Specifies the details of the database column to which the field will be mapped.

**@NamedQuery**

**@NamedQueries**: defines named queries in the entity classes. They are pre-defined queries that can be referenced by name and reused in multiple parts of a application.

**@CreationTimestamp**

**@UpdateTimestamp**

## Payload
**@NotNull**: Checks if a field is not null.

**@NotEmpty**: Ensures that a field is not null and not an empty string.

**@NotBlank**: Checks that a string field is not null and has at least one non-whitespace character.

**@Size**: Validates the size of a field, specifying minimum and maximum length.

**@Min**: Ensures that a numeric field is greater than or equal to the specified minimum value.

**@Max**: Validates that a numeric field is less than or equal to the specified maximum value.

**@Email**: Ensures that a field is a valid email address.

**@Pattern**: Allows you to define a custom regular expression for validation.

## DAO
**@Repository**
**@Query**: is used in Spring Data JPA to define custom queries for repository methods. It allows us to write JPQL or native SQL queries and associate them with specific repository methods.

**@PersistenceContext**

**@Transactional**


## Controller
**@RestController** = **@Controller** + **@ResponseBody**: A specialized version of the @Controller annotation that is a stereotype for creating RESTful controllers.

**@RequestMapping**: Maps HTTP requests to handler methods in the controller.

**@GetMapping**, **@PostMapping**, **@PutMapping**, **@DeleteMapping**: Shortcuts for **@RequestMapping**(method = RequestMethod.GET/POST/PUT/DELETE).

**@PathVariable**: Indicates that a method parameter should be bound to a URI template variable.

**@RequestBody**: Annotation indicating a method parameter should be bound to the body of the web request.

**@Autowired**: Marks a constructor, field, or setter method to be autowired by Spring's dependency injection facilities.


**@valid**: Apply the validation Rule here, if invalid, throw exception

## Exception
**@ResponseStatus**: declares the HTTP status code that should be returned in the response when a particular exception is thrown

@ExceptionHandler

@ControllerAdvice

## Service
**@Service**

## Main
**@EnableTransactionManagement**

**@SpringBootApplication** is a combination of three annotations:
- **@Configuration**
- **@EnableAutoConfiguration**
- **@ComponentScan**

## Bean
**@Configuration** with **@Bean** with **@Primary**

**@component**

**@Autowired**: By Type > By Name, could use with @Qualifier

**@Qualifier**

**@Resource**: By Name > By Type, specifying the name of the bean

**@Inject**

## Example

    @Entity
    @Table(name = "comments")
    public class Comment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @JsonProperty("name")
        private String name;
        private String email;
        private String body;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "post_id", nullable = false)
        private Post post;

        @CreationTimestamp
        private LocalDateTime createDateTime;

        @UpdateTimestamp
        private LocalDateTime updateDateTime;
    }
    
