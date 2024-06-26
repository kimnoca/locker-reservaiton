package yu.cse.locker.domain.locker.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InfoListResponseDto {
    private List<LockerInfoResponseDto> lockerInfoResponseDtoList;
}
