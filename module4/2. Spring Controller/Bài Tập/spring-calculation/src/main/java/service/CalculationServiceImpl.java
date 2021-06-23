package service;

import repository.CalculationRepository;
import repository.CalculationRepositoryImpl;

public class CalculationServiceImpl implements CalculationService {
    CalculationRepository calculationRepository = new CalculationRepositoryImpl();
    @Override
    public double calculation(Integer num1, Integer num2, String operator) {
        return calculationRepository.calculator(num1, num2,operator);
    }
}
