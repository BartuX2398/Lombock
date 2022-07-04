package pl.kurs.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor // ze zwyklymi polami
@RequiredArgsConstructor // z polami final

@Getter
@Setter


@ToString(includeFieldNames = false, onlyExplicitlyIncluded = true)
@Builder
public class Beer {
    @ToString.Include
    @NonNull
    private final String mark;
    @NonNull
    @ToString.Include
    private double price;
    @NonNull
    private List<String> components;
    private double power;

}
