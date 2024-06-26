package yu.cse.locker.domain.user.dto;


import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumberDto {

    @NotNull
    private String phoneNumber;
}
