package pro.patterns.creation.builder.lombok;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class UserBuilderOnLombok {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
}
