package pl.kurs.model;

import lombok.*;

import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames = false, onlyExplicitlyIncluded = true)
@Builder
public class Alcoholic {
    @ToString.Include
    @NonNull
    private String firstName;
    @ToString.Include
    @NonNull
    private String lastName;
    private List<Beer> beerList;

}
