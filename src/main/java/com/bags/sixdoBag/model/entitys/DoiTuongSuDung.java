package com.bags.sixdoBag.model.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "doi_tuong_su_dung")
public class DoiTuongSuDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

//    @NotBlank(message = "Mã Không Được Để Khoảng Trắng")
//    @NotEmpty(message = "Mã Không Được Để Trống")
//    @Length(max = 100, message = "Mã Không Vượt Quá 100 Ký Tự")
    @Column(name = "ma")
    private String maDoiTuongSuDung;

    @NotBlank(message = "Tên Không Được Để Khoảng Trắng")
    @NotEmpty(message = "Tên Không Được Để Trống")
    @Length(max = 300, message = "Tên Không Được Vượt Quá 300 Ký Tự")
    @Column(name = "ten")
    private String tenDoiTuongSuDung;

    @Column(name = "trang_thai")
    private Boolean trangThai;

}
