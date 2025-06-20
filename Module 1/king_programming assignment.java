#colby king module 1 assignment due 6/1/2025#
# Function to calculate energy needed to heat water
def calculate_energy(water_mass, initial_temp, final_temp):
    specific_heat_capacity = 4184  # Joules per kilogram per degree Celsius
    energy = water_mass * (final_temp - initial_temp) * specific_heat_capacity
    return energy

water_mass = float(input("Enter the amount of water in kilograms: "))
initial_temp = float(input("Enter the initial temperature in Celsius: "))
final_temp = float(input("Enter the final temperature in Celsius: "))

energy_needed = calculate_energy(water_mass, initial_temp, final_temp)

print(f"The energy needed to heat the water is {energy_needed:.2f} Joules.")
