package com.GCM.web;

import java.util.List;

import com.GCM.entities.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GCM.services.GCMServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/GCM")
public class GCMRessources {
    public final GCMServices gcmServices;

    public GCMRessources(GCMServices gcmServices) {
        super();
        this.gcmServices = gcmServices;
    }
    //HospitalisationV
    @PostMapping("/HOV/add")
    public ResponseEntity<HospitalisationV> addHospitalisationV(@RequestBody HospitalisationV hospitalisationV) {
        HospitalisationV hospitalisationV1 = gcmServices.addHospitalisationV(hospitalisationV);
        return new ResponseEntity<>(hospitalisationV1, HttpStatus.CREATED);
    }

    @GetMapping("/HOV/all")
    public ResponseEntity<List<HospitalisationV>> getAllHospitalisationV() {
        List<HospitalisationV> hospitalisationVS = gcmServices.findAllHospitalisationV();

        return new ResponseEntity<>(hospitalisationVS , HttpStatus.OK);
    }
    @GetMapping("/HOV/find/{id}")
    public ResponseEntity<HospitalisationV> getHospitalisationVById(@PathVariable("id") Long id) {
        HospitalisationV patient = gcmServices.findHospitalisationVById(id);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }


    @PutMapping("/HOV/update")
    public ResponseEntity<HospitalisationV> updateHospitalisationV(@RequestBody HospitalisationV hospitalisationV) {
        HospitalisationV updatehospitalisationV = gcmServices.updateHospitalisationV(hospitalisationV);
        return new ResponseEntity<>(updatehospitalisationV, HttpStatus.OK);
    }

    @DeleteMapping("/HOV/delete/{id}")
    public ResponseEntity<?> deleteHospitalisationV(@PathVariable("id") Long id) {
        gcmServices.deleteHospitalisationV(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //AnnalyseV
    @PostMapping("/ANNV/add")
    public ResponseEntity<AnnalyseV> addAnnalyseV(@RequestBody AnnalyseV annalyseV) {
        AnnalyseV annalyseV1 = gcmServices.addAnnalyseV(annalyseV);
        return new ResponseEntity<>(annalyseV1, HttpStatus.CREATED);
    }

    @GetMapping("/ANNV/all")
    public ResponseEntity<List<AnnalyseV>> getAllAnnalyseV() {
        List<AnnalyseV> annalyseVS = gcmServices.findAllAnnalyseV();

        return new ResponseEntity<>(annalyseVS , HttpStatus.OK);
    }
    @DeleteMapping("/ANNV/delete/{id}")
    public ResponseEntity<?> deleteAnnalyseV(@PathVariable("id") Long id) {
        gcmServices.deleteAnnalyseV(id);
        return new ResponseEntity<>(HttpStatus.OK);}

    //VisitePM
    @PostMapping("/VP/add")
    public ResponseEntity<VisitePM> addVisitePM(@RequestBody VisitePM visitePM) {
        VisitePM visitePM2 = gcmServices.addVisitePM(visitePM);
        return new ResponseEntity<>(visitePM2, HttpStatus.CREATED);
    }

    @GetMapping("/VPM/all")
    public ResponseEntity<List<VisitePM>> getAllVisitePM() {
        List<VisitePM> visitePMs = gcmServices.findAllVisitePM();
        System.err.println("patients visites : " + visitePMs);
        return new ResponseEntity<>(visitePMs, HttpStatus.OK);
    }

    @GetMapping("/VPM/find/{id}")
    public ResponseEntity<VisitePM> getVisitePMById(@PathVariable("id") Long id) {
        VisitePM visitePM = gcmServices.findVisitePMById(id);
        return new ResponseEntity<>(visitePM, HttpStatus.OK);
    }


    @PutMapping("/VPM/update")
    public ResponseEntity<VisitePM> updateVisitePM(@RequestBody VisitePM visitePM) {
        VisitePM updatevisitePM = gcmServices.updateVisitePM(visitePM);
        return new ResponseEntity<>(updatevisitePM, HttpStatus.OK);
    }

    @DeleteMapping("/VPM/delete/{id}")
    public ResponseEntity<?> deleteVisitePM(@PathVariable("id") Long id) {
        gcmServices.deleteVisitePM(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    //PatientDesea
    @PostMapping("/PA/add")
    public ResponseEntity<PatientDesease> addPA(@RequestBody PatientDesease pa) {
        PatientDesease newPa = gcmServices.addPatientDesease(pa);
        return new ResponseEntity<>(newPa, HttpStatus.CREATED);
    }

    @GetMapping("/PA/all")
    public ResponseEntity<List<PatientDesease>> getAllPatientDesease() {
        List<PatientDesease> patientDeseases = gcmServices.findAllPatientDeseases();

        return new ResponseEntity<>(patientDeseases, HttpStatus.OK);
    }

    @GetMapping("/PA/find/{id}")
    public ResponseEntity<PatientDesease> getPatientDeseaseById(@PathVariable("id") Long id) {
        PatientDesease patient = gcmServices.findPatientDeseaseById(id);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }


    @PutMapping("/PA/update")
    public ResponseEntity<PatientDesease> updatePatientDesease(@RequestBody PatientDesease patient) {
        PatientDesease updatePatient = gcmServices.updatePatientDesease(patient);
        return new ResponseEntity<>(updatePatient, HttpStatus.OK);
    }

    @DeleteMapping("/PA/delete/{id}")
    public ResponseEntity<?> deletePatientDesease(@PathVariable("id") Long id) {
        gcmServices.deletePatientDesease(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //OrdonanceMV
    @PostMapping("/OMV/add")
    public ResponseEntity<OrdonanceMV> addOMV(@RequestBody OrdonanceMV ordonanceMV) {
        OrdonanceMV newordonanceMV = gcmServices.addOrdonanceMV(ordonanceMV);
        return new ResponseEntity<>(newordonanceMV, HttpStatus.CREATED);
    }

    @GetMapping("/OMV/all")
    public ResponseEntity<List<OrdonanceMV>> getAllOMV() {
        List<OrdonanceMV> ordonanceMVs = gcmServices.findAllOrdonanceMV();
        return new ResponseEntity<>(ordonanceMVs, HttpStatus.OK);
    }
    @GetMapping("/OMV/find/{id}")
    public ResponseEntity<OrdonanceMV> getOrdonanceMVById(@PathVariable("id") Long id) {
        OrdonanceMV ordonanceMV = gcmServices.findOrdonanceMVById(id);
        return new ResponseEntity<>(ordonanceMV , HttpStatus.OK);
    }


    @PutMapping("/OMV/update")
    public ResponseEntity<OrdonanceMV> updateOrdonanceMV(@RequestBody OrdonanceMV ordonanceMV ) {
        OrdonanceMV updateordonanceMV  = gcmServices.updateOrdonanceMV(ordonanceMV );
        return new ResponseEntity<>(updateordonanceMV , HttpStatus.OK);
    }

    @DeleteMapping("/OMV/delete/{id}")
    public ResponseEntity<?> deleteOrdonanceMV(@PathVariable("id") Long id) {
        gcmServices.deleteOrdonanceMV(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //MedecinPH
    @PostMapping("/MedecinPH/add")
    public ResponseEntity<MedecinPH> addMedecinPH(@RequestBody MedecinPH medecinPh) {
        MedecinPH newmedPh = gcmServices.addMedecinPH(medecinPh);
        return new ResponseEntity<>(newmedPh, HttpStatus.CREATED);
    }

    @GetMapping("/MedecinPH/all")
    public ResponseEntity<List<MedecinPH>> getAllMedecinMV() {
        List<MedecinPH> medecinPHs = gcmServices.findAllMedecinPH();
        return new ResponseEntity<>(medecinPHs, HttpStatus.OK);
    }
    @GetMapping("/MedecinPH/find/{id}")
    public ResponseEntity<MedecinPH> getMedecinPHById(@PathVariable("id") Long id) {
        MedecinPH medecinPH = gcmServices.findMedecinPHById(id);
        return new ResponseEntity<>(medecinPH, HttpStatus.OK);
    }


    @PutMapping("/MedecinPH/update")
    public ResponseEntity<MedecinPH> updateMedecinPH(@RequestBody MedecinPH medecinPH) {
        MedecinPH medecinPH1 = gcmServices.updateMedecinPH(medecinPH);
        return new ResponseEntity<>(medecinPH1, HttpStatus.OK);
    }

    @DeleteMapping("/MedecinPH/delete/{id}")
    public ResponseEntity<?> deleteMedecinPH(@PathVariable("id") Long id) {
        gcmServices.deleteMedecinPH(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Hospitalisation Ressources

    @GetMapping("/Hospitalisation/all")
    public ResponseEntity<List<Hospitalisation>> getAllHospitalisation() {
        List<Hospitalisation> hospitalisations = gcmServices.findAllHospitalisation();
        return new ResponseEntity<>(hospitalisations, HttpStatus.OK);
    }

    @GetMapping("/Hospitalisation/find/{id}")
    public ResponseEntity<Hospitalisation> findCosultationById(@PathVariable("id") int id) {
        Hospitalisation hospitalisation = gcmServices.findHospitaliationById(id);
        return new ResponseEntity<>(hospitalisation, HttpStatus.OK);
    }

    @PostMapping("/Hospitalisation/add")
    public ResponseEntity<Hospitalisation> addCosultation(@RequestBody Hospitalisation hospitalisation) {
        Hospitalisation newhospitalisation = gcmServices.addHospitalisation(hospitalisation);
        return new ResponseEntity<>(newhospitalisation, HttpStatus.CREATED);
    }

    @PutMapping("/Hospitalisation/update")
    public ResponseEntity<Hospitalisation> updateHospitalisation(@RequestBody Hospitalisation hospitalisation) {
        Hospitalisation updatehospitalisation = gcmServices.updateHospitalisation(hospitalisation);
        return new ResponseEntity<>(updatehospitalisation, HttpStatus.OK);
    }

    @DeleteMapping("/Hospitalisation/delete/{id}")
    public ResponseEntity<?> deleteCosultation(@PathVariable("id") int id) {
        gcmServices.deleteHospitalisation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // Annalyse Ressources

    @GetMapping("/Annalyse/all")
    public ResponseEntity<List<Annalyse>> getAllAnnalyse() {
        List<Annalyse> annalyses = gcmServices.findAllAnnalyse();
        return new ResponseEntity<>(annalyses, HttpStatus.OK);
    }

    @GetMapping("/Annalyse/find/{id}")
    public ResponseEntity<Annalyse> findAnnalyseById(@PathVariable("id") int id) {
        Annalyse annalyse = gcmServices.findAnnalyseById(id);
        return new ResponseEntity<>(annalyse, HttpStatus.OK);
    }

    @PostMapping("/Annalyse/add")
    public ResponseEntity<Annalyse> addAnnalyse(@RequestBody Annalyse annalyse) {
        Annalyse newannalyse = gcmServices.addAnnalyse(annalyse);
        return new ResponseEntity<>(newannalyse, HttpStatus.CREATED);
    }

    @PutMapping("/Annalyse/update")
    public ResponseEntity<Annalyse> updateAnnalyse(@RequestBody Annalyse annalyse) {
        Annalyse updateannalyse = gcmServices.updateAnnalyse(annalyse);
        return new ResponseEntity<>(updateannalyse, HttpStatus.OK);
    }

    @DeleteMapping("/Annalyse/delete/{id}")
    public ResponseEntity<?> deleteAnnalyse(@PathVariable("id") int id) {
        gcmServices.deleteAnnalyse(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    //Visite Ressourece
    @GetMapping("/Visite/all")
    public ResponseEntity<List<Visite>> getAllVisite() {
        List<Visite> visites = gcmServices.findAllVisite();
        return new ResponseEntity<>(visites, HttpStatus.OK);
    }

    @GetMapping("/Visite/find/{id}")
    public ResponseEntity<Visite> getVisiteById(@PathVariable("id") int id) {
        Visite visite = gcmServices.findVisiteById(id);
        return new ResponseEntity<>(visite, HttpStatus.OK);
    }

    @PostMapping("/Visite/add")
    public ResponseEntity<Visite> addVisite(@RequestBody Visite visite) {
        Visite newdemande_Consultation = gcmServices.addVisite(visite);
        return new ResponseEntity<>(newdemande_Consultation, HttpStatus.CREATED);
    }

    @PutMapping("/Visite/update")
    public ResponseEntity<Visite> updateVisite(@RequestBody Visite visite) {
        Visite updatedemande_Consultation = gcmServices.updateVisite(visite);
        return new ResponseEntity<>(updatedemande_Consultation, HttpStatus.OK);
    }

    @DeleteMapping("/Visite/delete/{id}")
    public ResponseEntity<?> deleteVisite(@PathVariable("id") int id) {
        gcmServices.deleteVisite(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Antecdent Ressource

    @GetMapping("/Antecedent/all")
    public ResponseEntity<List<Antecedent>> getAllAntecedent() {
        List<Antecedent> antecedents = gcmServices.findAllAntecedent();
        return new ResponseEntity<>(antecedents, HttpStatus.OK);
    }

    @GetMapping("/Antecedent/find/{id}")
    public ResponseEntity<Antecedent> getAntecedentById(@PathVariable("id") int id) {
        Antecedent antecedent = gcmServices.findAntecedentById(id);
        return new ResponseEntity<>(antecedent, HttpStatus.OK);
    }

    @PostMapping("/Antecedent/add")
    public ResponseEntity<Antecedent> addAntecedent(@RequestBody Antecedent antecedent) {
        Antecedent newantecedent = gcmServices.addAntecedent(antecedent);
        return new ResponseEntity<>(newantecedent, HttpStatus.CREATED);
    }

    @PutMapping("/Antecedent/update")
    public ResponseEntity<Antecedent> updateAntecedent(@RequestBody Antecedent antecedent) {
        Antecedent updateantecedent = gcmServices.updateAntecedent(antecedent);
        return new ResponseEntity<>(updateantecedent, HttpStatus.OK);
    }

    @DeleteMapping("/Antecedent/delete/{id}")
    public ResponseEntity<?> deleteAntecedent(@PathVariable("id") int id) {
        gcmServices.deleteAntecedent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    // Localisation Ressource

    @GetMapping("/Localisation/all")
    public ResponseEntity<List<Localisation>> getAllLocalisation() {
        List<Localisation> localisations = gcmServices.findAllLocalisation();
        return new ResponseEntity<>(localisations, HttpStatus.OK);
    }

    @GetMapping("/Localisation/find/{id}")
    public ResponseEntity<Localisation> getLocalisationById(@PathVariable("id") int id) {
        Localisation localisation = gcmServices.findLocalisationById(id);
        return new ResponseEntity<>(localisation, HttpStatus.OK);
    }

    @PostMapping("/Localisation/add")
    public ResponseEntity<Localisation> addLocalisation(@RequestBody Localisation localisation) {
        Localisation newlocalisation = gcmServices.addLocalisation(localisation);
        return new ResponseEntity<>(newlocalisation, HttpStatus.CREATED);
    }

    @PutMapping("/Localisation/update")
    public ResponseEntity<Localisation> updateLocalisation(@RequestBody Localisation localisation) {
        Localisation updatelocalisation = gcmServices.updatelocalisation(localisation);
        return new ResponseEntity<>(updatelocalisation, HttpStatus.OK);
    }

    @DeleteMapping("/Localisation/delete/{id}")
    public ResponseEntity<?> deleteLocalisation(@PathVariable("id") int id) {
        gcmServices.deleteLocalisation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //Medecin Ressource

    @GetMapping("/Medecin/all")
    public ResponseEntity<List<Medecin>> getAllMedecins() {
        List<Medecin> medecins = gcmServices.findAllMedecins();
        return new ResponseEntity<>(medecins, HttpStatus.OK);
    }

    @GetMapping("/Medecin/find/{id}")
    public ResponseEntity<Medecin> getMedecinById(@PathVariable("id") int id) {
        Medecin medecin = gcmServices.findMedecinById(id);
        return new ResponseEntity<>(medecin, HttpStatus.OK);
    }

    @PostMapping("/Medecin/add")
    public ResponseEntity<Medecin> addMedecin(@RequestBody Medecin medecin) {
        Medecin newMedecin = gcmServices.addMedecin(medecin);
        return new ResponseEntity<>(newMedecin, HttpStatus.CREATED);
    }

    @PutMapping("/Medecin/update")
    public ResponseEntity<Medecin> updateMededcin(@RequestBody Medecin medecin) {
        Medecin updateMedecin = gcmServices.updateMedecin(medecin);
        return new ResponseEntity<>(updateMedecin, HttpStatus.OK);
    }

    @DeleteMapping("/Medecin/delete/{id}")
    public ResponseEntity<?> deleteMedecin(@PathVariable("id") int id) {
        gcmServices.deleteMedecin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //Ordonance Ressource
    @GetMapping("/Ordonance/all")
    public ResponseEntity<List<Ordonance>> getAllOrdonance() {
        List<Ordonance> Medicamants = gcmServices.findAllMedicaments();
        return new ResponseEntity<>(Medicamants, HttpStatus.OK);
    }

    @GetMapping("/Ordonance/find/{id}")
    public ResponseEntity<Ordonance> getOrdonanceById(@PathVariable("id") int id) {
        Ordonance Medicamant = gcmServices.findOrdonanceById(id);
        return new ResponseEntity<>(Medicamant, HttpStatus.OK);
    }

    @PostMapping("/Ordonance/add")
    public ResponseEntity<Ordonance> addOrdonance(@RequestBody Ordonance Medicamant) {
        Ordonance newMedicamant = gcmServices.addMedicament(Medicamant);
        return new ResponseEntity<>(newMedicamant, HttpStatus.CREATED);
    }

    @PutMapping("/Ordonance/update")
    public ResponseEntity<Ordonance> updateOrdonance(@RequestBody Ordonance Medicamant) {
        Ordonance updateMedicamant = gcmServices.updateMedicament(Medicamant);
        return new ResponseEntity<>(updateMedicamant, HttpStatus.OK);
    }

    @DeleteMapping("/Ordonance/delete/{id}")
    public ResponseEntity<?> deleteOrdonance(@PathVariable("id") int id) {
        gcmServices.deleteMedicament(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //Patient Ressource
    @GetMapping("/Patient/all")
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> patients = gcmServices.findAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @GetMapping("/Patient/find/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") int id) {
        Patient patient = gcmServices.findPatientById(id);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @PostMapping("/Patient/add")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
        Patient newPatient = gcmServices.addPatient(patient);
        return new ResponseEntity<>(newPatient, HttpStatus.CREATED);
    }

    @PutMapping("/Patient/update")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient) {
        Patient updatePatient = gcmServices.updatePatient(patient);
        return new ResponseEntity<>(updatePatient, HttpStatus.OK);
    }

    @DeleteMapping("/Patient/delete/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable("id") int id) {
        gcmServices.deletePatient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //Plage Horaire Ressource
    @GetMapping("/PHoraire/all")
    public ResponseEntity<List<Plage_Horaire>> getAllPlage_Horaire() {
        List<Plage_Horaire> horaires = gcmServices.findAllPlage_Horaire();
        return new ResponseEntity<>(horaires, HttpStatus.OK);
    }

    @GetMapping("/PHoraire/find/{id}")
    public ResponseEntity<Plage_Horaire> getPlage_HoraireById(@PathVariable("id") int id) {
        Plage_Horaire horaire = gcmServices.findPlage_HoraireByID(id);
        return new ResponseEntity<>(horaire, HttpStatus.OK);
    }

    @PostMapping("/PHoraire/add")
    public ResponseEntity<Plage_Horaire> addPlage_Horaire(@RequestBody Plage_Horaire plage_Horaire) {
        Plage_Horaire newhoraire = gcmServices.addPlage_Horaire(plage_Horaire);
        return new ResponseEntity<>(newhoraire, HttpStatus.CREATED);
    }

    @PutMapping("/PHoraire/update")
    public ResponseEntity<Plage_Horaire> updatePlage_Horaire(@RequestBody Plage_Horaire plage_Horaire) {
        Plage_Horaire updatehoraire = gcmServices.updatePlage_Horaire(plage_Horaire);
        return new ResponseEntity<>(updatehoraire, HttpStatus.OK);
    }

    @DeleteMapping("/PHoraire/delete/{id}")
    public ResponseEntity<?> deletePlage_Horaire(@PathVariable("id") int id) {
        gcmServices.deletePlage_Horaire(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //Medicament Ressource

    @GetMapping("/Medicament/all")
    public ResponseEntity<List<Medicament>> getAllMedicament() {
        List<Medicament> medicaments = gcmServices.findAllMedicament();
        return new ResponseEntity<>(medicaments, HttpStatus.OK);
    }

    @GetMapping("/Medicament/find/{id}")
    public ResponseEntity<Medicament> findMedicamentById(@PathVariable("id") int id) {
        Medicament medicament = gcmServices.findMedicamentById(id);
        return new ResponseEntity<>(medicament, HttpStatus.OK);
    }

    @PostMapping("/Medicament/add")
    public ResponseEntity<Medicament> addMedicament(@RequestBody Medicament medicament) {
        Medicament newmedicament = gcmServices.addMedicament(medicament);
        return new ResponseEntity<>(newmedicament, HttpStatus.CREATED);
    }

    @PutMapping("/Medicament/update")
    public ResponseEntity<Medicament> updateMedicament(@RequestBody Medicament medicament) {
        Medicament updatemedicament = gcmServices.updateMedicament(medicament);
        return new ResponseEntity<>(updatemedicament, HttpStatus.OK);
    }

    @DeleteMapping("/Medicament/delete/{id}")
    public ResponseEntity<?> deleteMedicament(@PathVariable("id") int id) {
        gcmServices.deleteMedicament(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //Secretaire Ressource

    @GetMapping("/Secretaire/all")
    public ResponseEntity<List<Secretaire>> getAllSecretaire() {
        List<Secretaire> secretaires = gcmServices.findAllSecretaire();
        return new ResponseEntity<>(secretaires, HttpStatus.OK);
    }

    @GetMapping("/Secretaire/find/{id}")
    public ResponseEntity<Secretaire> findSecretaireById(@PathVariable("id") int id) {
        Secretaire secretaire = gcmServices.findSecretaireById(id);
        return new ResponseEntity<>(secretaire, HttpStatus.OK);
    }

    @PostMapping("/Secretaire/add")
    public ResponseEntity<Secretaire> addSecretaire(@RequestBody Secretaire secretaire) {
        Secretaire newsecretaire = gcmServices.addSecretaire(secretaire);
        return new ResponseEntity<>(newsecretaire, HttpStatus.CREATED);
    }

    @PutMapping("/Secretaire/update")
    public ResponseEntity<Secretaire> updateSecretaire(@RequestBody Secretaire secretaire) {
        Secretaire updatesecretaire = gcmServices.addSecretaire(secretaire);
        return new ResponseEntity<>(updatesecretaire, HttpStatus.OK);
    }

    @DeleteMapping("/Secretaire/delete/{id}")
    public ResponseEntity<?> deleteSecretaire(@PathVariable("id") int id) {
        gcmServices.deleteSecretaire(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
