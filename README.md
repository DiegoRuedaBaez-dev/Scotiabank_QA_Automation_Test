# Technical Test - QA Automation Engineer | Scotiatech Hiring Test

<details>
  <summary><strong>Setup</strong></summary>

- Install IntelliJ IDEA or your preferred IDE
- Initialize project with Maven as the Build System
- Check MVN Repository or Documentation for each dependency
- Install dependencies copying the implementation code in the pom.xml
- Install scoop and allure locally
    - Set-ExecutionPolicy RemoteSigned -scope CurrentUser iwr -useb get.scoop.sh | iex
    - scoop install allure
- Run test
    - mvn clean test
</details>

<details>
  <summary><strong>Test Cases</strong></summary>
<br>

### **Test Cases**

| Test Case ID | Title                                | Priority (5 Lowest -> 1 Highest) | Expected Result                                         |
|--------------|--------------------------------------|----------------------------------|---------------------------------------------------------|
| TC-001       | Login Validation                     | 1                                | Correct access to store                                 |
| TC-002       | Catalog Filtering Validation         | 3                                | Correct filtering workflow with all 4 options           |
| TC-003       | Cart Add/Remove Workflow Validation  | 2                                | Correctly add or remove any item from the store/cart    |
| TC-004       | Checkout validation                  | 1                                | Fulfill correct order workflow and confirmation         |
| TC-005       | Invalid Login Credentials Validation | 2                                | Not able to access to store                             |
| TC-006       | Visual UI/UX Validation              | 2                                | UI Assets correctly align without affecting UX workflow |


---

## **TC-001 | Login Validation**

**Priority: 1** 

**Preconditions:**
- Access to Login frontpage (https://www.saucedemo.com/)
- Check Accepted Username and Password Data

**Steps:**
1. Access to Login frontpage
2. Use Accepted Username and Password Data
3. Access to store correctly

**Expected Result: Correct access to store without missing information or performance issues**

---

## **TC-002 | Catalog Filtering Validation**

**Priority: 3**

**Preconditions:**
- Access to Login frontpage (https://www.saucedemo.com/)
- Check Accepted Username and Password Data

**Steps:**
1. Access to Login frontpage
2. Use Accepted Username and Password Data
3. Access to store correctly
4. Locate filtering options on the store
5. Select the option that you to filter (Try at least once each option)
6. See the results

**Expected Result: Correct filtering depending on the option selected without missing information or performance issues**

---
## **TC-003 | Cart Add/Remove Workflow Validation**

**Priority: 2**

**Preconditions:**
- Access to Login frontpage (https://www.saucedemo.com/)
- Check Accepted Username and Password Data

**Steps:**
  1. Access to Login frontpage
  2. Use Accepted Username and Password Data
  3. Access to store correctly
  4. Locate "Add to Cart" button on wanted item
  5. Check if the item was correctly Added to the cart by Locating the Cart Button
  6. Access to Cart and Remove from there
  7. Repeat steps 4 & 5 but now Remove directly from the Catalog

**Expected Result: Correct Addition or Remove from Cart/Catalog without missing information or performance issues**

---
## **TC-004 | Checkout validation**

**Priority: 1**

**Preconditions:**
- Access to Login frontpage (https://www.saucedemo.com/)
- Check Accepted Username and Password Data

**Steps:**
1. Access to Login frontpage
2. Use Accepted Username and Password Data
3. Access to store correctly
4. Locate "Add to Cart" button on wanted item
5. Check if the item was correctly Added to the cart by Locating the Cart Button
6. Access to Cart
7. Locate the Checkout button
8. Correctly go to Shipping Address form
9. Fill the form data and proceed with Continue.
10. Confirm Order confirmation Prompt

**Expected Result: Fulfill correct order workflow and confirmation without missing information or performance issues**

---
## **TC-005 | Login Validation**

**Priority: 2**

**Preconditions:**
- Access to Login frontpage (https://www.saucedemo.com/)
- Check Accepted Username and Password Data

**Steps:**
1. Access to Login frontpage
2. Use Un-accepted/Blocked Username and Password Data
3. Not able to access store

**Expected Result: Not able to access to store**

---
## **TC-006 | Visual UI/UX Validation**

**Priority: 2**

**Preconditions:**
- Access to Login frontpage (https://www.saucedemo.com/)
- Check Accepted Username and Password Data

**Steps:**
1. Access to Login frontpage
2. Use Accepted Username and Password Data
3. Access to store correctly
4. Check the catalog for the correct prices and item images
5. Check the UI icons/assets that are correctly placed/align
6. Check Checkout workflow to be finished correctly

**Expected Result: UI Assets correctly align without affecting UX workflow or present any performance issues**

---
    
</details>

<details>
  <summary><strong>Bugs/Error Founds</strong></summary>
<br>

### **General Bugs/Errors Report**

| Bug ID | Type      | Severity | Description                                                                          |
|--------|-----------|----------|--------------------------------------------------------------------------------------|
| BUG-001 |  |     |  |


---

## **BUG-001**

**Severity:** Major

**Repro steps:**

**Actual result:**  

**Expected Result:**  

**Impact:**  

---
</details>

