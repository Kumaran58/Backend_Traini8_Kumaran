package com.Traini8.Traini8Project.Model;

import java.time.Instant;
import java.util.List;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CenterModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 40, message = "Invalid Center Name")
	private String centerName;

	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code should be 12 Alphanumeric Charaters")
	private String centerCode;

	@Embedded
	private Address address;

	@Min(0)
	private Integer studentCapacity;

	private List<String> coursesOffered;

	private Instant createdOn;

	@Email(message = "Invalid Email Address")
	private String contactEmail;

	@Pattern(regexp = "^\\+?[0-9. ()-]{7,15}$", message = "Enter Proper Phone Number")
	@NotBlank
	private String contactPhone;

}
