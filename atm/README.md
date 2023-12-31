## Конзолен Банкомат 💳🏦

### Условие на задачата

Създайте конзолно приложение, което имитира функционалността на банкомат, позволяващ на потребителите да извършват различни банкови операции.

### Цели на задачата:

Целта на задачата е да се създаде приложение, което имитира основните функционалности на реален банкомат. Това включва възможността за проверка на баланс, депозитиране, теглене на средства, както и валидиране на потребителски данни.

### Стъпки за Реализация

1. **Клас `Account`**:
   - `balance`: променлива за съхранение на баланса на сметката.
   - `accountNumber`: уникален идентификатор на сметката.
   - `pin`: личен идентификационен номер за достъп до сметката.
   - Методи за достъп до тези стойности (getters/setters).

2. **Функции за Управление на Сметка**:
   - `checkBalance()`: връща текущия баланс на сметката.
   - `deposit(amount)`: позволява на потребителя да депозира средства в сметката.
   - `withdraw(amount)`: позволява на потребителя да тегли средства, ако има достатъчно средства в сметката.

3. **Конзолен Интерфейс**:
   - Потребителят въвежда своя PIN.
   - Избор от опции: проверка на баланса, депозит, теглене.
   - Валидация на въведените суми и PIN.

4. **Сигурност и Валидация**:
   - Проверка на PIN преди изпълнение на всяка транзакция.
   - Ограничения при теглене на средства (например, максимална сума на транзакция).
   - Обработка на грешки и невалидни въвеждания.

### Реализация на Клиента

- При стартиране на приложението, потребителят вижда меню с опции за взаимодействие с банкомата.
- Потребителят може да избере да провери баланса на своята сметка, да направи депозит или да тегли средства.
- При всяка транзакция се изисква въвеждането на PIN за потвърждение на идентичността.
- Приложението дава обратна връзка за успешността на всяка операция.

### Технически Аспекти

- **Вход и Изход**: Използването на `Scanner` класа в Java за четене на вход от конзолата.
- **Обработка на Изключения**: Проверка за валидност на въведените данни и обработка на потенциални грешки.
- **Логика за Сървър/Клиент**: Въпреки че задачата не изисква мрежова връзка, структурата на програмата трябва да е готова за разширение към клиент-сървър модел в бъдеще.