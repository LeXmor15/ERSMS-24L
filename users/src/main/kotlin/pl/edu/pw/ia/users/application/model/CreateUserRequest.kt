package pl.edu.pw.ia.users.application.model

import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.NotBlank

data class CreateUserRequest(

	@Schema(maxLength = 50)
	@NotBlank(message = "Name cannot be blank")
	@Max(value = 50, message = "Maximum allowed name length is 50 characters")
	val name: String,

	@Schema(maxLength = 320)
	@Email
	@NotBlank(message = "Email cannot be blank")
	@Max(value = 320, message = "Maximum allowed email length is 320 characters")
	val email: String,
)
