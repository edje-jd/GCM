package com.GCM.services;

import java.util.List;

import javax.transaction.Transactional;

import com.GCM.dao.*;
import com.GCM.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GCM.exceptions.UserNotFoundException;

@Service
@Transactional
public class GCMServices {
	
	private final MedecinRepository medecinRepository ;
	private final OrdonanceRepository ordonanceRepository;
	private final PatientRepository patientRepository ;
	private final Plage_HoraireRepository  plage_HoraireRepository ;
	private final AnnalyseRepository annalyseRepository;
	private final HospitalisationRepository hospitalisationRepository;
	private final LocalisationRepository localisationRepository ;
	private final AntecedentRepositoy antecedentRepositoy ;
	private final MedicamentRepository medicamentRepository ;
	private final VisiteRepository visiteRepository ;
	private final SecretaireRepository secretaireRepository ;
	private final PatientDeseaseRepository patientDeseaseRepository;
	private final MedecinPHRepository medecinPHRepository;
	private final OrdonanceMVRepository ordonanceMVRepository;
	private final VisitePMRepository visitePMRepository;
	private final AnnalyseVRepository annalyseVRepository;
	private final HospitalisationVRepository hospitalisationVRepository;
	
	@Autowired
	public GCMServices(MedecinRepository medecinRepository, OrdonanceRepository ordonanceRepository,
			PatientRepository patientRepository, Plage_HoraireRepository plage_HoraireRepository,
			AnnalyseRepository annalyseRepository, HospitalisationRepository hospitalisationRepository,
			LocalisationRepository localisationRepository, AntecedentRepositoy antecedentRepositoy,
			MedicamentRepository medicamentRepository, VisiteRepository visiteRepository,
			SecretaireRepository secretaireRepository,PatientDeseaseRepository patientDeseaseRepository,
			MedecinPHRepository medecinPHRepository,OrdonanceMVRepository ordonanceMVRepository,
			 VisitePMRepository visitePMRepository,AnnalyseVRepository annalyseVRepository
	         ,HospitalisationVRepository hospitalisationVRepository) {
		super();
		this.medecinRepository = medecinRepository;
		this.ordonanceRepository = ordonanceRepository;
		this.patientRepository = patientRepository;
		this.plage_HoraireRepository = plage_HoraireRepository;
		this.annalyseRepository = annalyseRepository;
		this.hospitalisationRepository = hospitalisationRepository;
		this.localisationRepository = localisationRepository;
		this.antecedentRepositoy = antecedentRepositoy;
		this.medicamentRepository = medicamentRepository;
		this.visiteRepository = visiteRepository;
		this.secretaireRepository = secretaireRepository;
		this.patientDeseaseRepository=patientDeseaseRepository;
		this.medecinPHRepository = medecinPHRepository ;
		this.ordonanceMVRepository = ordonanceMVRepository;
		this.visitePMRepository = visitePMRepository;
		this.annalyseVRepository = annalyseVRepository;
		this.hospitalisationVRepository= hospitalisationVRepository;
	}
	//HospitalisationV
	public HospitalisationV addHospitalisationV(HospitalisationV hospitalisationV) {
		return (HospitalisationV) hospitalisationVRepository.save(hospitalisationV);

	}
	public List<HospitalisationV> findAllHospitalisationV(){
		List<HospitalisationV> hospitalisationVS =hospitalisationVRepository.findAll();

		return hospitalisationVS ;}
	//AnnalyseV
	public AnnalyseV addAnnalyseV (AnnalyseV annalyseV) {
		return (AnnalyseV) annalyseVRepository.save(annalyseV);

	}
	public List<AnnalyseV> findAllAnnalyseV(){
		List<AnnalyseV> annalyseVS =annalyseVRepository.findAll();

		return annalyseVS ;
	}
	//VisitePM
    public VisitePM addVisitePM (VisitePM  visitePM) {
		return visitePMRepository.save(visitePM);
		
	}
    public List<VisitePM> findAllVisitePM(){
		List<VisitePM> visitePMs =visitePMRepository.findAll();
		
		return visitePMs;
	}
    
	
	//OrdonanceMV
	public OrdonanceMV addOrdonanceMV(OrdonanceMV ordonanceMV) {
		
		
		return ordonanceMVRepository.save(ordonanceMV);
		
	}
	public List<OrdonanceMV> findAllOrdonanceMV(){
		List<OrdonanceMV> MV =ordonanceMVRepository.findAll();
		
		return MV;
	}
	
	// PatientDesease
	public PatientDesease addPatientDesease(PatientDesease pa) {
		System.err.println(pa.getPatient());
		System.err.println(pa.getAntcedent());
		
		return patientDeseaseRepository.save(pa);
		
	}
	

	public List<PatientDesease> findAllPatientDeseases(){
		List<PatientDesease> pa = patientDeseaseRepository.findAll();
		System.err.println("patients with deseases: " + pa.size());
		return pa;
	}
	 public PatientDesease updatePatientDesease(PatientDesease patientDesease){
	        return patientDeseaseRepository.save(patientDesease);
	    }
	    public PatientDesease findPatientDeseaseById(Long id){
	        return patientDeseaseRepository.findPatientDeseaseById(id).orElseThrow(()-> new UserNotFoundException("Patient by id "+id+ "was not found"));
	    }
	    public void deletePatientDesease(Long id){
	    	patientDeseaseRepository.deletePatientDeseaseById(id);}
	
	//Patient MedecinPH
	public MedecinPH addMedecinPH(MedecinPH medecinPh) {
		System.err.println(medecinPh.getMedecin());
		System.err.println(medecinPh.getPlage_Horaire());
		
		return medecinPHRepository.save(medecinPh);
		
	}
	public List< MedecinPH> findAllMedecinPH(){
		List<MedecinPH> MPH =medecinPHRepository.findAll();
		
		return MPH;
	}
	
	//Visite Service

	public Visite addVisite(Visite visite) {
		return visiteRepository.save(visite);
	}
	
	public List<Visite> findAllVisite(){
		return visiteRepository.findAll();
	}
	
	public Visite updateVisite(Visite visite) {
		return visiteRepository.save(visite);
	}
	
	public Visite findVisiteById(int id) {
		return visiteRepository.findVisiteById(id).orElseThrow(()-> new UserNotFoundException("Visite by id "+id+ "was not found"));
	}
	
	public void deleteVisite(int id) {
		visiteRepository.deleteVisiteById(id);
	}
	
	//Annalyse service
	
	 
		public Annalyse addAnnalyse(Annalyse annalyse) {
			return annalyseRepository.save(annalyse);
		}
		
		public List<Annalyse> findAllAnnalyse(){
			return annalyseRepository.findAll();
		}
		public Annalyse updateAnnalyse(Annalyse annalyse) {
			return annalyseRepository.save(annalyse);
		
		}
		
		public Annalyse findAnnalyseById(int id) {
			return annalyseRepository.findAnnalyseById(id).orElseThrow(()-> new UserNotFoundException("Annalyse by id "+id+ "was not found"));
		}
		
		public void deleteAnnalyse(int id) {
			annalyseRepository.deleteAnnalyseById(id);
		}
		
		//Hospitalisation Service
		public Hospitalisation addHospitalisation(Hospitalisation hospitalisation) {
			return hospitalisationRepository.save(hospitalisation);
		}
		
		public List<Hospitalisation> findAllHospitalisation(){
			return hospitalisationRepository.findAll();
		}
		
		public Hospitalisation updateHospitalisation(Hospitalisation hospitalisation) {
			return hospitalisationRepository.save(hospitalisation);
		}
		public Hospitalisation findHospitaliationById(int id) {
			return hospitalisationRepository.findHopitalisationById(id).orElseThrow(()-> new UserNotFoundException("Hospitalisation by id "+id+ "was not found"));
		}
		public void deleteHospitalisation(int id) {
			 hospitalisationRepository.deleteHospitalisationById(id);
		}
		
		//Antecedent Service
		public Antecedent addAntecedent(Antecedent antecedent) {
			return antecedentRepositoy.save(antecedent);
		}
		
		public List<Antecedent> findAllAntecedent() {
			return antecedentRepositoy.findAll();
		}
		
		public Antecedent updateAntecedent(Antecedent antecedent) {
			return antecedentRepositoy.save(antecedent);
		}
		
		public Antecedent findAntecedentById(int id) {
			return antecedentRepositoy.findAntecedentById(id).orElseThrow(()-> new UserNotFoundException("Antecedent by id "+id+ "was not found"));
		}
		
		public void deleteAntecedent(int id) {
			antecedentRepositoy.deleteAntecedentById(id);
		}
		
		//Localisation Service
		public Localisation addLocalisation(Localisation localisation) {
			return localisationRepository.save(localisation);
		}
		
		public List<Localisation> findAllLocalisation() {
			return localisationRepository.findAll();
		}
		
		public Localisation updatelocalisation(Localisation localisation) {
			return localisationRepository.save(localisation);
		}
		
		public Localisation findLocalisationById(int id) {
			return localisationRepository.findLocalisationById(id).orElseThrow(()-> new UserNotFoundException("Localisation by id "+id+ "was not found"));
		}
		
		public void deleteLocalisation(int id) {
			localisationRepository.deleteLocalisationById(id);
		}
		//Medecin Service
		public Medecin addMedecin(Medecin medecin){
	        return medecinRepository.save(medecin);
	    }
	    public List<Medecin> findAllMedecins(){
	        return medecinRepository.findAll();
	    }
	    
	    public Medecin updateMedecin(Medecin medecin){
	        return medecinRepository.save(medecin);
	    }
	    public Medecin findMedecinById(int id){
	        return medecinRepository.findMedecinById(id).orElseThrow(()-> new UserNotFoundException("Medecin by id "+id+ "was not found"));
	    }
	    public void deleteMedecin(int id){
	        medecinRepository.deleteMedecinById(id);
	    }
	    //Ordonnance service
	    public Ordonance addMedicament(Ordonance medicament){
	        return ordonanceRepository.save(medicament);
	    }
		
		public List<Ordonance> findAllMedicaments(){
	        return ordonanceRepository.findAll();
	    }
		
		 public Ordonance updateMedicament(Ordonance medicament){
		        return ordonanceRepository.save(medicament);
		    }
		 
		 public Ordonance findOrdonanceById(int id){
		        return ordonanceRepository.findOrdonanceById(id).orElseThrow(()-> new UserNotFoundException("Ordonnance by id "+id+ "was not found"));
		  }
		 public void deleteMedicament(int id){
			 ordonanceRepository.deleteOrdonanceById(id);
		    }
		
		 //Patient Service
		 public Patient addPatient(Patient patient){
		        return patientRepository.save(patient);
		    }
			
			public List<Patient> findAllPatients(){
		        return patientRepository.findAll();
		    }

		    public Patient updatePatient(Patient patient){
		        return patientRepository.save(patient);
		    }
		    public Patient findPatientById(int id){
		        return patientRepository.findPatientById(id).orElseThrow(()-> new UserNotFoundException("Patient by id "+id+ "was not found"));
		    }
		    public void deletePatient(int id){
		        patientRepository.deletePatientById(id);
		    }
			//Plage Horaire Service
		    public Plage_Horaire addPlage_Horaire(Plage_Horaire plage_Horaire) {
				return plage_HoraireRepository.save(plage_Horaire);
			}
			
			public List<Plage_Horaire> findAllPlage_Horaire(){
				return plage_HoraireRepository.findAll();
			}
			public Plage_Horaire updatePlage_Horaire(Plage_Horaire plage_Horaire) {
				return plage_HoraireRepository.save(plage_Horaire); 
			}
			
			public Plage_Horaire findPlage_HoraireByID(int id) {
				return plage_HoraireRepository.findPlage_HoraireById(id).orElseThrow(()-> new UserNotFoundException("Plage Horaire by id "+id+ "was not found"));
			} 
			
			public void deletePlage_Horaire(int id) {
				plage_HoraireRepository.deletePlage_HoraireById(id);
			}
			
			//Medicament Service
			public Medicament addMedicament(Medicament medicament){
				return medicamentRepository.save(medicament);
			}
			
			public List<Medicament> findAllMedicament(){
				return medicamentRepository.findAll();
			}
			
			public Medicament updateMedicament(Medicament medicament) {
				return medicamentRepository.save(medicament);
			}
			
			public Medicament findMedicamentById(int id) {
				return medicamentRepository.findMedicamentById(id).orElseThrow(()-> new UserNotFoundException("RDV by id "+id+ "was not found"));
			}
			public void deleteRDV(int id) {
				medicamentRepository.deleteMedicamentById(id);
			}

			// Secretaire Service
			public Secretaire addSecretaire(Secretaire secretaire) {
				return secretaireRepository.save(secretaire);
			}
			public List<Secretaire> findAllSecretaire(){
				return secretaireRepository.findAll();
			}
			
			public Secretaire updateSecretaire(Secretaire secretaire) {
				return secretaireRepository.save(secretaire);
			}
			
			public Secretaire findSecretaireById(int id) {
				return secretaireRepository.findSecretaireById(id).orElseThrow(()-> new UserNotFoundException("Secretaire by id "+id+ "was not found"));
			}
			
			public void deleteSecretaire(int id) {
				secretaireRepository.deleteSecretaireById(id);
			}
			
	
	
	

}
