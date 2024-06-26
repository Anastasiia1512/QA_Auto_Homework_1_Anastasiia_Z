
SELECT `Visits`.`VisitDate`, `Visits`.`Reason`, `MedicalRecords`.`Diagnosis`, `MedicalRecords`.`Treatment`, `Cats`.`Name` AS CatName, `Cats`.`Breed`, `Owners`.`Name` AS OwnerName,`Owners`.`Phone`
FROM `Visits`
JOIN `MedicalRecords` ON `Visits`.`VisitID` = `MedicalRecords`.`VisitID`
JOIN `Cats` ON `Visits`.`CatID` = `Cats`.`CatID`
JOIN `Owners` ON `Cats`.`OwnerID` = `Owners`.`OwnerID`
WHERE `VisitDate` > '2024-03-01';
