package com.Carrier.RestAPI;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.Carrier.BuisnessLayer.BuisnessLayerInterface;
import com.Carrier.Entity.ObjectOfTable;
import com.Carrier.Entity.workListTableObject;

@RestController
@RequestMapping("/")
@CrossOrigin
public class RController implements ApiInterface {

	private BuisnessLayerInterface buisnesLayInter;

	public RController(BuisnessLayerInterface buisnesLayInter) {
		this.buisnesLayInter = buisnesLayInter;
	}

	@GetMapping("/userPassword/{id}")
	public String password(@PathVariable int id) {
		return buisnesLayInter.getUserPasswordById(id);
	}

	@GetMapping("/userName/{id}")
	public String userName(@PathVariable int id) {
		return buisnesLayInter.getUserNameById(id);
	}

	@GetMapping("/userSurname/{id}")
	public String userSurname(@PathVariable int id) {
		return buisnesLayInter.getUserSurnameById(id);
	}

	@GetMapping("/userEmail/{id}")
	public String userEmail(@PathVariable int id) {
		return buisnesLayInter.getUserEmailById(id);
	}

	@GetMapping("/userAbout/{id}")
	public String userAbout(@PathVariable int id) {
		return buisnesLayInter.getUserAboutById(id);
	}

	@PostMapping("add")
	public void add(@RequestBody ObjectOfTable user) { // @Requstbody bu annatotationimiz bir JSON verisini java
														// nesnesinni donusturur
		buisnesLayInter.addUser(user);
	}

	@PostMapping("update/name/{id}")
	public void updateName(@RequestBody @PathVariable int id, @RequestBody String name) { // @Requstbody bu
																							// annatotationimiz bir JSON
																							// verisini java nesnesinni
																							// donusturur
		buisnesLayInter.updateUserNameById(id, name);
	}

	@Override
	@PostMapping("workAdd")
	public void addWork(@RequestBody workListTableObject work) {
		buisnesLayInter.addWork(work);

	}

	@Override
	@PostMapping("update/work")
	public void editWork(@RequestBody workListTableObject work) {
		buisnesLayInter.editWork(work);
	}

	@Override
	@PostMapping("delete/work/{id}")
	public void deleteAnnounce(@RequestBody workListTableObject work) {
		buisnesLayInter.deleteAnnounce(work);

	}

	@Override
	@GetMapping("/all")
	public List<workListTableObject> getAll() {
		return buisnesLayInter.getAll();
	}

	@Override
	@GetMapping("/getAnnounceById/filter")
	public List<workListTableObject> getAllByFilter(@RequestBody workListTableObject work) {
		return buisnesLayInter.getAllByFilter(work);
	}

	@Override
	@GetMapping("/{id}")
	public List<ObjectOfTable> getUserFullById(@PathVariable int id) {
		return buisnesLayInter.getUserFullById(id);
	}

	@Override
	@GetMapping("/signIn")
	public List<ObjectOfTable> getUserPasswordByEmail(@RequestParam String email) {
		return buisnesLayInter.getUserPasswordByEmail(email);
	}

	@Override
	@GetMapping("/workDetail/{id}")
	public List<workListTableObject> getWorkById(@PathVariable int id) {
		return buisnesLayInter.getWorkById(id);
	}

}
